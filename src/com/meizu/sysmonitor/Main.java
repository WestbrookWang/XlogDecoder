package com.meizu.sysmonitor;

public class Main {
    public static void main(String[] args) {
        if (args.length < 1){
            System.out.println("Usage: java -jar XlogDecoder.jar [infile] [outfile]");
            return;
        }
        String infile, outfile;
        infile = args[0];
        if (args.length<2) {
            outfile = infile + ".xlog";
        }else {
            outfile = args[1];
        }
        System.out.println("Task start...");
        long startTime = System.currentTimeMillis();
        XlogFileDecoder.ParseFile(infile, outfile);
        System.out.println(String.format("Task end and spent %d ms",System.currentTimeMillis() -startTime));
    }
}
