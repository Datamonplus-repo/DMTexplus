package app.controlcalidadhtd ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pccpolnsinlineas extends GXProcedure
{
   public pccpolnsinlineas( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pccpolnsinlineas.class ), "" );
   }

   public pccpolnsinlineas( int remoteHandle ,
                            ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short[] executeUdp( String[] aP0 ,
                              int[] aP1 ,
                              byte[] aP2 ,
                              String[] aP3 ,
                              String[] aP4 )
   {
      AV60Tab_orden = new short[200] ;
      execute_int(aP0, aP1, aP2, aP3, aP4, AV60Tab_orden);
      return AV60Tab_orden;
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        short[] AV60Tab_orden )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, AV60Tab_orden);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             short[] AV60Tab_orden )
   {
      pccpolnsinlineas.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pccpolnsinlineas.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pccpolnsinlineas.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pccpolnsinlineas.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pccpolnsinlineas.this.AV54CCTarc = aP4[0];
      this.aP4 = aP4;
      pccpolnsinlineas.this.AV60Tab_orden = AV60Tab_orden;
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
      this.aP0[0] = pccpolnsinlineas.this.A396EmprCod;
      this.aP1[0] = pccpolnsinlineas.this.A129BarCod;
      this.aP2[0] = pccpolnsinlineas.this.A132BarCodReo;
      this.aP3[0] = pccpolnsinlineas.this.A130BarCodPar;
      this.aP4[0] = pccpolnsinlineas.this.AV54CCTarc;
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

   private byte A132BarCodReo ;
   private short Gx_err ;
   private int A129BarCod ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV54CCTarc ;
   private short[] AV60Tab_orden ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
}

