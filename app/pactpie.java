package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pactpie extends GXProcedure
{
   public pactpie( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pactpie.class ), "" );
   }

   public pactpie( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 )
   {
      pactpie.this.aP4 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 )
   {
      pactpie.this.AV15EmprCod = aP0[0];
      this.aP0 = aP0;
      pactpie.this.AV16BarCod = aP1[0];
      this.aP1 = aP1;
      pactpie.this.AV17BarCodReo = aP2[0];
      this.aP2 = aP2;
      pactpie.this.AV18BarCodPar = aP3[0];
      this.aP3 = aP3;
      pactpie.this.AV19BarPieCod = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV20OK = " " ;
      while ( ( GXutil.strcmp(AV20OK, httpContext.getMessage( "N", "")) != 0 ) && ( GXutil.strcmp(AV20OK, httpContext.getMessage( "S", "")) != 0 ) )
      {
      }
      if ( GXutil.strcmp(AV20OK, httpContext.getMessage( "S", "")) == 0 )
      {
         GXv_char1[0] = AV15EmprCod ;
         GXv_int2[0] = AV16BarCod ;
         GXv_int3[0] = AV17BarCodReo ;
         GXv_char4[0] = AV18BarCodPar ;
         GXv_char5[0] = AV19BarPieCod ;
         new app.pmodest(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_int3, GXv_char4, GXv_char5) ;
         pactpie.this.AV15EmprCod = GXv_char1[0] ;
         pactpie.this.AV16BarCod = GXv_int2[0] ;
         pactpie.this.AV17BarCodReo = GXv_int3[0] ;
         pactpie.this.AV18BarCodPar = GXv_char4[0] ;
         pactpie.this.AV19BarPieCod = GXv_char5[0] ;
         GXv_char5[0] = AV15EmprCod ;
         GXv_int2[0] = AV16BarCod ;
         GXv_int3[0] = AV17BarCodReo ;
         GXv_char4[0] = AV18BarCodPar ;
         GXv_char1[0] = httpContext.getMessage( "P", "") ;
         new app.pciebar(remoteHandle, context).execute( GXv_char5, GXv_int2, GXv_int3, GXv_char4, GXv_char1) ;
         pactpie.this.AV15EmprCod = GXv_char5[0] ;
         pactpie.this.AV16BarCod = GXv_int2[0] ;
         pactpie.this.AV17BarCodReo = GXv_int3[0] ;
         pactpie.this.AV18BarCodPar = GXv_char4[0] ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pactpie.this.AV15EmprCod;
      this.aP1[0] = pactpie.this.AV16BarCod;
      this.aP2[0] = pactpie.this.AV17BarCodReo;
      this.aP3[0] = pactpie.this.AV18BarCodPar;
      this.aP4[0] = pactpie.this.AV19BarPieCod;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV20OK = "" ;
      GXv_char5 = new String[1] ;
      GXv_int2 = new int[1] ;
      GXv_int3 = new byte[1] ;
      GXv_char4 = new String[1] ;
      GXv_char1 = new String[1] ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV17BarCodReo ;
   private byte GXv_int3[] ;
   private short Gx_err ;
   private int AV16BarCod ;
   private int GXv_int2[] ;
   private String AV15EmprCod ;
   private String AV18BarCodPar ;
   private String AV19BarPieCod ;
   private String AV20OK ;
   private String GXv_char5[] ;
   private String GXv_char4[] ;
   private String GXv_char1[] ;
   private String[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
}

