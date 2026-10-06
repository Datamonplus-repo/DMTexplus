package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcopenc extends GXProcedure
{
   public pcopenc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcopenc.class ), "" );
   }

   public pcopenc( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 )
   {
      pcopenc.this.aP1 = new int[] {0};
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
      pcopenc.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pcopenc.this.AV8DisCod = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV11F_Laundry ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "LAUNDR", ""), GXv_int2) ;
      pcopenc.this.GXt_int1 = GXv_int2[0] ;
      AV11F_Laundry = GXt_int1 ;
      GXt_int1 = (byte)(DecimalUtil.decToDouble(AV12Suprema)) ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "SUPREM", ""), GXv_int2) ;
      pcopenc.this.GXt_int1 = GXv_int2[0] ;
      AV12Suprema = DecimalUtil.doubleToDec(GXt_int1) ;
      GXt_int1 = AV13Platino ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PLATIN", ""), GXv_int2) ;
      pcopenc.this.GXt_int1 = GXv_int2[0] ;
      AV13Platino = GXt_int1 ;
      GXt_int1 = AV14Eliot ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ELIOTL", ""), GXv_int2) ;
      pcopenc.this.GXt_int1 = GXv_int2[0] ;
      AV14Eliot = GXt_int1 ;
      GXv_int3[0] = AV9Copias ;
      new app.pbuscon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ENCCLI", ""), GXv_int3) ;
      pcopenc.this.AV9Copias = GXv_int3[0] ;
      if ( AV9Copias == 0 )
      {
         AV9Copias = 1 ;
      }
      while ( AV9Copias > 0 )
      {
         Gx_out = httpContext.getMessage( "SCR", "") ;
         if ( ( AV12Suprema.doubleValue() == 1 ) && ( AV13Platino == 0 ) && ( AV14Eliot == 0 ) )
         {
            GXv_char4[0] = A396EmprCod ;
            GXv_int3[0] = AV8DisCod ;
            GXv_char5[0] = Gx_out ;
            new app.rdissup(remoteHandle, context).execute( GXv_char4, GXv_int3, GXv_char5) ;
            pcopenc.this.A396EmprCod = GXv_char4[0] ;
            pcopenc.this.AV8DisCod = GXv_int3[0] ;
            pcopenc.this.Gx_out = GXv_char5[0] ;
         }
         else if ( AV14Eliot == 1 )
         {
            GXv_char5[0] = A396EmprCod ;
            GXv_int3[0] = AV8DisCod ;
            GXv_char4[0] = Gx_out ;
            new app.reliop(remoteHandle, context).execute( GXv_char5, GXv_int3, GXv_char4) ;
            pcopenc.this.A396EmprCod = GXv_char5[0] ;
            pcopenc.this.AV8DisCod = GXv_int3[0] ;
            pcopenc.this.Gx_out = GXv_char4[0] ;
         }
         else if ( AV13Platino == 1 )
         {
            GXv_char5[0] = A396EmprCod ;
            GXv_int3[0] = AV8DisCod ;
            GXv_char4[0] = Gx_out ;
            new app.rdispla(remoteHandle, context).execute( GXv_char5, GXv_int3, GXv_char4) ;
            pcopenc.this.A396EmprCod = GXv_char5[0] ;
            pcopenc.this.AV8DisCod = GXv_int3[0] ;
            pcopenc.this.Gx_out = GXv_char4[0] ;
         }
         else
         {
            GXv_char5[0] = A396EmprCod ;
            GXv_int3[0] = AV8DisCod ;
            GXv_char4[0] = Gx_out ;
            new app.renccli(remoteHandle, context).execute( GXv_char5, GXv_int3, GXv_char4) ;
            pcopenc.this.A396EmprCod = GXv_char5[0] ;
            pcopenc.this.AV8DisCod = GXv_int3[0] ;
            pcopenc.this.Gx_out = GXv_char4[0] ;
         }
         AV9Copias = (int)(AV9Copias-1) ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pcopenc.this.A396EmprCod;
      this.aP1[0] = pcopenc.this.AV8DisCod;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV12Suprema = DecimalUtil.ZERO ;
      GXv_int2 = new byte[1] ;
      Gx_out = "" ;
      GXv_char5 = new String[1] ;
      GXv_int3 = new int[1] ;
      GXv_char4 = new String[1] ;
      Gx_out = "FIL" ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV11F_Laundry ;
   private byte AV13Platino ;
   private byte AV14Eliot ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private short Gx_err ;
   private int AV8DisCod ;
   private int AV9Copias ;
   private int GXv_int3[] ;
   private java.math.BigDecimal AV12Suprema ;
   private String A396EmprCod ;
   private String Gx_out ;
   private String GXv_char5[] ;
   private String GXv_char4[] ;
   private int[] aP1 ;
   private String[] aP0 ;
}

