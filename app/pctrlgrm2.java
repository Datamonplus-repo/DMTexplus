package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pctrlgrm2 extends GXProcedure
{
   public pctrlgrm2( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pctrlgrm2.class ), "" );
   }

   public pctrlgrm2( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             short[] aP1 ,
                             short[] aP2 )
   {
      pctrlgrm2.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        short[] aP1 ,
                        short[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             short[] aP1 ,
                             short[] aP2 ,
                             String[] aP3 )
   {
      pctrlgrm2.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pctrlgrm2.this.AV11Disgracru = aP1[0];
      this.aP1 = aP1;
      pctrlgrm2.this.AV12oldgrm = aP2[0];
      this.aP2 = aP2;
      pctrlgrm2.this.Gx_msg = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV14Pargrm ;
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = httpContext.getMessage( "PARGMC", "") ;
      GXv_int4[0] = GXt_int1 ;
      new app.pvalcon(remoteHandle, context).execute( GXv_char2, GXv_char3, GXv_int4) ;
      pctrlgrm2.this.A396EmprCod = GXv_char2[0] ;
      pctrlgrm2.this.GXt_int1 = GXv_int4[0] ;
      AV14Pargrm = (short)(GXt_int1) ;
      Gx_msg = " " ;
      AV13Dif = (short)(AV11Disgracru-AV12oldgrm) ;
      if ( AV13Dif < 0 )
      {
         AV13Dif = (short)((AV13Dif*-1)) ;
      }
      if ( ( AV13Dif > AV14Pargrm ) && ( AV13Dif != 0 ) && ( AV12oldgrm > 0 ) )
      {
         Gx_msg = httpContext.getMessage( "Grm Crudo Inicial = ", "") + GXutil.str( AV12oldgrm, 4, 0) + GXutil.chr( (short)(13)) ;
         Gx_msg += httpContext.getMessage( "Grm Crudo Final   = ", "") + GXutil.str( AV11Disgracru, 4, 0) + GXutil.chr( (short)(13)) ;
         Gx_msg += httpContext.getMessage( "Atencion. La diferencia de GRM= ", "") + GXutil.str( AV13Dif, 4, 0) + GXutil.chr( (short)(13)) ;
         Gx_msg += httpContext.getMessage( "es SUPERIOR al control de GRM= ", "") + GXutil.str( AV14Pargrm, 4, 0) + GXutil.chr( (short)(13)) ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pctrlgrm2.this.A396EmprCod;
      this.aP1[0] = pctrlgrm2.this.AV11Disgracru;
      this.aP2[0] = pctrlgrm2.this.AV12oldgrm;
      this.aP3[0] = pctrlgrm2.this.Gx_msg;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_char2 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_int4 = new int[1] ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV11Disgracru ;
   private short AV12oldgrm ;
   private short AV14Pargrm ;
   private short AV13Dif ;
   private short Gx_err ;
   private int GXt_int1 ;
   private int GXv_int4[] ;
   private String A396EmprCod ;
   private String Gx_msg ;
   private String GXv_char2[] ;
   private String GXv_char3[] ;
   private String[] aP3 ;
   private String[] aP0 ;
   private short[] aP1 ;
   private short[] aP2 ;
}

