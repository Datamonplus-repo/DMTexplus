package app.controlcalidadhtd ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pccvarval extends GXProcedure
{
   public pccvarval( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pccvarval.class ), "" );
   }

   public pccvarval( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             int aP1 ,
                             byte aP2 ,
                             String aP3 ,
                             String aP4 ,
                             short aP5 ,
                             int aP6 ,
                             String aP7 ,
                             byte[] aP8 ,
                             String[] aP9 )
   {
      pccvarval.this.aP10 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10);
      return aP10[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        byte aP2 ,
                        String aP3 ,
                        String aP4 ,
                        short aP5 ,
                        int aP6 ,
                        String aP7 ,
                        byte[] aP8 ,
                        String[] aP9 ,
                        String[] aP10 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             byte aP2 ,
                             String aP3 ,
                             String aP4 ,
                             short aP5 ,
                             int aP6 ,
                             String aP7 ,
                             byte[] aP8 ,
                             String[] aP9 ,
                             String[] aP10 )
   {
      pccvarval.this.AV27EmprCod = aP0;
      pccvarval.this.AV28BarCod = aP1;
      pccvarval.this.AV29BarCodReo = aP2;
      pccvarval.this.AV30BarCodPar = aP3;
      pccvarval.this.AV31ProCod = aP4;
      pccvarval.this.AV32BarOrdLin = aP5;
      pccvarval.this.AV33CCTCod = aP6;
      pccvarval.this.AV34CCVCod = aP7;
      pccvarval.this.aP8 = aP8;
      pccvarval.this.aP9 = aP9;
      pccvarval.this.aP10 = aP10;
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
      this.aP8[0] = pccvarval.this.AV48varOk;
      this.aP9[0] = pccvarval.this.AV47mensaje;
      this.aP10[0] = pccvarval.this.AV35CCVal;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV47mensaje = "" ;
      AV35CCVal = "" ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV29BarCodReo ;
   private byte AV48varOk ;
   private short AV32BarOrdLin ;
   private short Gx_err ;
   private int AV28BarCod ;
   private int AV33CCTCod ;
   private String AV27EmprCod ;
   private String AV30BarCodPar ;
   private String AV31ProCod ;
   private String AV34CCVCod ;
   private String AV35CCVal ;
   private String AV47mensaje ;
   private String[] aP10 ;
   private byte[] aP8 ;
   private String[] aP9 ;
}

