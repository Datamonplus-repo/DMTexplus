package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcoppda extends GXProcedure
{
   public pcoppda( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcoppda.class ), "" );
   }

   public pcoppda( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 )
   {
      pcoppda.this.aP1 = new int[] {0};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 )
   {
      pcoppda.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pcoppda.this.AV15ALbreccod = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV14Eliot ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ELIOTL", ""), GXv_int2) ;
      pcoppda.this.GXt_int1 = GXv_int2[0] ;
      AV14Eliot = GXt_int1 ;
      if ( AV9Copias == 0 )
      {
         AV9Copias = 1 ;
      }
      while ( AV9Copias > 0 )
      {
         Gx_out = httpContext.getMessage( "SCR", "") ;
         if ( AV14Eliot == 1 )
         {
            GXv_char3[0] = A396EmprCod ;
            GXv_int4[0] = AV15ALbreccod ;
            GXv_char5[0] = Gx_out ;
            new app.reliotp(remoteHandle, context).execute( GXv_char3, GXv_int4, GXv_char5) ;
            pcoppda.this.A396EmprCod = GXv_char3[0] ;
            pcoppda.this.AV15ALbreccod = GXv_int4[0] ;
            pcoppda.this.Gx_out = GXv_char5[0] ;
         }
         else
         {
            GXv_char5[0] = A396EmprCod ;
            GXv_int4[0] = AV15ALbreccod ;
            GXv_char3[0] = Gx_out ;
            new app.rremalmprendas(remoteHandle, context).execute( GXv_char5, GXv_int4, GXv_char3) ;
            pcoppda.this.A396EmprCod = GXv_char5[0] ;
            pcoppda.this.AV15ALbreccod = GXv_int4[0] ;
            pcoppda.this.Gx_out = GXv_char3[0] ;
         }
         AV9Copias = (int)(AV9Copias-1) ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pcoppda.this.A396EmprCod;
      this.aP1[0] = pcoppda.this.AV15ALbreccod;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int2 = new byte[1] ;
      Gx_out = "" ;
      GXv_char5 = new String[1] ;
      GXv_int4 = new int[1] ;
      GXv_char3 = new String[1] ;
      Gx_out = "FIL" ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV14Eliot ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private short Gx_err ;
   private int AV15ALbreccod ;
   private int AV9Copias ;
   private int GXv_int4[] ;
   private String A396EmprCod ;
   private String Gx_out ;
   private String GXv_char5[] ;
   private String GXv_char3[] ;
   private int[] aP1 ;
   private String[] aP0 ;
}

