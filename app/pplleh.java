package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pplleh extends GXProcedure
{
   public pplleh( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pplleh.class ), "" );
   }

   public pplleh( int remoteHandle ,
                  ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( short[] aP0 ,
                           int[] aP1 ,
                           String[] aP2 ,
                           String[] aP3 ,
                           String[] aP4 ,
                           String[] aP5 )
   {
      pplleh.this.aP6 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( short[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 ,
                        byte[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( short[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 ,
                             byte[] aP6 )
   {
      pplleh.this.AV8Err1 = aP0[0];
      this.aP0 = aP0;
      pplleh.this.AV9gxDBErr1 = aP1[0];
      this.aP1 = aP1;
      pplleh.this.AV10gxDBTxt1 = aP2[0];
      this.aP2 = aP2;
      pplleh.this.AV13gxOper1 = aP3[0];
      this.aP3 = aP3;
      pplleh.this.AV12gxErrTbl1 = aP4[0];
      this.aP4 = aP4;
      pplleh.this.AV17Pgm = aP5[0];
      this.aP5 = aP5;
      pplleh.this.AV11gxErrOpt1 = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pplleh.this.AV8Err1;
      this.aP1[0] = pplleh.this.AV9gxDBErr1;
      this.aP2[0] = pplleh.this.AV10gxDBTxt1;
      this.aP3[0] = pplleh.this.AV13gxOper1;
      this.aP4[0] = pplleh.this.AV12gxErrTbl1;
      this.aP5[0] = pplleh.this.AV17Pgm;
      this.aP6[0] = pplleh.this.AV11gxErrOpt1;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV11gxErrOpt1 ;
   private short AV8Err1 ;
   private short Gx_err ;
   private int AV9gxDBErr1 ;
   private String AV10gxDBTxt1 ;
   private String AV13gxOper1 ;
   private String AV12gxErrTbl1 ;
   private String AV17Pgm ;
   private byte[] aP6 ;
   private short[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private String[] aP5 ;
}

