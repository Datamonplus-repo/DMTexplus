package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ppllaeh extends GXProcedure
{
   public ppllaeh( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ppllaeh.class ), "" );
   }

   public ppllaeh( int remoteHandle ,
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
      ppllaeh.this.aP6 = new byte[] {0};
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
      ppllaeh.this.AV13Err1 = aP0[0];
      this.aP0 = aP0;
      ppllaeh.this.AV8gxDBErr1 = aP1[0];
      this.aP1 = aP1;
      ppllaeh.this.AV9gxDBTxt1 = aP2[0];
      this.aP2 = aP2;
      ppllaeh.this.AV12gxOper1 = aP3[0];
      this.aP3 = aP3;
      ppllaeh.this.AV11gxErrTbl1 = aP4[0];
      this.aP4 = aP4;
      ppllaeh.this.AV14Pgm = aP5[0];
      this.aP5 = aP5;
      ppllaeh.this.AV10gxErrOpt1 = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = context.globals.Gx_eop ;
      GXv_int2[0] = AV13Err1 ;
      GXv_int3[0] = AV8gxDBErr1 ;
      GXv_char4[0] = AV9gxDBTxt1 ;
      GXv_char5[0] = AV12gxOper1 ;
      GXv_char6[0] = AV11gxErrTbl1 ;
      GXv_char7[0] = AV14Pgm ;
      GXv_int8[0] = GXt_int1 ;
      new app.pplleh(remoteHandle, context).execute( GXv_int2, GXv_int3, GXv_char4, GXv_char5, GXv_char6, GXv_char7, GXv_int8) ;
      ppllaeh.this.AV13Err1 = GXv_int2[0] ;
      ppllaeh.this.AV8gxDBErr1 = GXv_int3[0] ;
      ppllaeh.this.AV9gxDBTxt1 = GXv_char4[0] ;
      ppllaeh.this.AV12gxOper1 = GXv_char5[0] ;
      ppllaeh.this.AV11gxErrTbl1 = GXv_char6[0] ;
      ppllaeh.this.AV14Pgm = GXv_char7[0] ;
      ppllaeh.this.GXt_int1 = GXv_int8[0] ;
      context.globals.Gx_eop = GXt_int1 ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = ppllaeh.this.AV13Err1;
      this.aP1[0] = ppllaeh.this.AV8gxDBErr1;
      this.aP2[0] = ppllaeh.this.AV9gxDBTxt1;
      this.aP3[0] = ppllaeh.this.AV12gxOper1;
      this.aP4[0] = ppllaeh.this.AV11gxErrTbl1;
      this.aP5[0] = ppllaeh.this.AV14Pgm;
      this.aP6[0] = ppllaeh.this.AV10gxErrOpt1;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int2 = new short[1] ;
      GXv_int3 = new int[1] ;
      GXv_char4 = new String[1] ;
      GXv_char5 = new String[1] ;
      GXv_char6 = new String[1] ;
      GXv_char7 = new String[1] ;
      GXv_int8 = new byte[1] ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV10gxErrOpt1 ;
   private byte GXt_int1 ;
   private byte GXv_int8[] ;
   private short AV13Err1 ;
   private short GXv_int2[] ;
   private short Gx_err ;
   private int AV8gxDBErr1 ;
   private int GXv_int3[] ;
   private String AV9gxDBTxt1 ;
   private String AV12gxOper1 ;
   private String AV11gxErrTbl1 ;
   private String AV14Pgm ;
   private String GXv_char4[] ;
   private String GXv_char5[] ;
   private String GXv_char6[] ;
   private String GXv_char7[] ;
   private byte[] aP6 ;
   private short[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private String[] aP5 ;
}

