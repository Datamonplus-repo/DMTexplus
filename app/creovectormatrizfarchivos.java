package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class creovectormatrizfarchivos extends GXProcedure
{
   public creovectormatrizfarchivos( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( creovectormatrizfarchivos.class ), "" );
   }

   public creovectormatrizfarchivos( int remoteHandle ,
                                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String[][] executeUdp( String aP0 ,
                                 String aP1 ,
                                 String[] AV16Tab_maq )
   {
      AV10MaqHdrs = new String[100][1000] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         GX_J = 1 ;
         while ( GX_J <= 1000 )
         {
            AV10MaqHdrs[GX_I-1][GX_J-1] = "" ;
            GX_J = (int)(GX_J+1) ;
         }
         GX_I = (int)(GX_I+1) ;
      }
      execute_int(aP0, aP1, AV16Tab_maq, AV10MaqHdrs);
      return AV10MaqHdrs;
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String[] AV16Tab_maq ,
                        String[][] AV10MaqHdrs )
   {
      execute_int(aP0, aP1, AV16Tab_maq, AV10MaqHdrs);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String[] AV16Tab_maq ,
                             String[][] AV10MaqHdrs )
   {
      creovectormatrizfarchivos.this.AV11Maquinas = aP0;
      creovectormatrizfarchivos.this.AV12MaquinasHdrs = aP1;
      creovectormatrizfarchivos.this.AV16Tab_maq = AV16Tab_maq;
      creovectormatrizfarchivos.this.AV10MaqHdrs = AV10MaqHdrs;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV9i = (short)(0) ;
      AV15t = (short)(0) ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         GX_J = 1 ;
         while ( GX_J <= 1000 )
         {
            AV10MaqHdrs[GX_I-1][GX_J-1] = " " ;
            GX_J = (int)(GX_J+1) ;
         }
         GX_I = (int)(GX_I+1) ;
      }
      AV20MaximaColumna = (short)(0) ;
      AV14Resultado = context.getSessionInstances().getDelimitedFiles().dfropen( AV12MaquinasHdrs, 1024, ";", "", httpContext.getMessage( "UTF-8", "")) ;
      if ( (0==AV14Resultado) )
      {
         AV9i = (short)(0) ;
         AV14Resultado = context.getSessionInstances().getDelimitedFiles().dfrnext( ) ;
         while ( AV14Resultado == 0 )
         {
            AV9i = (short)(AV9i+1) ;
            AV15t = (short)(0) ;
            GXv_char1[0] = AV17Cadena ;
            GXt_int2 = context.getSessionInstances().getDelimitedFiles().dfrgtxt( GXv_char1, (short)(1024)) ;
            AV17Cadena = GXv_char1[0] ;
            AV14Resultado = GXt_int2 ;
            while ( AV14Resultado == 0 )
            {
               AV15t = (short)(AV15t+1) ;
               AV10MaqHdrs[AV9i-1][AV15t-1] = AV17Cadena ;
               GXv_char1[0] = AV17Cadena ;
               GXt_int2 = context.getSessionInstances().getDelimitedFiles().dfrgtxt( GXv_char1, (short)(1024)) ;
               AV17Cadena = GXv_char1[0] ;
               AV14Resultado = GXt_int2 ;
            }
            if ( AV20MaximaColumna < AV15t )
            {
               AV20MaximaColumna = AV15t ;
            }
            AV14Resultado = context.getSessionInstances().getDelimitedFiles().dfrnext( ) ;
         }
         AV19TotalFilas = AV15t ;
         AV14Resultado = context.getSessionInstances().getDelimitedFiles().dfrclose( ) ;
      }
      AV9i = (short)(0) ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV16Tab_maq[GX_I-1] = " " ;
         GX_I = (int)(GX_I+1) ;
      }
      AV14Resultado = context.getSessionInstances().getDelimitedFiles().dfropen( AV11Maquinas, 1024, ";", "", httpContext.getMessage( "UTF-8", "")) ;
      if ( (0==AV14Resultado) )
      {
         AV9i = (short)(0) ;
         AV14Resultado = context.getSessionInstances().getDelimitedFiles().dfrnext( ) ;
         GXv_char1[0] = AV17Cadena ;
         GXt_int2 = context.getSessionInstances().getDelimitedFiles().dfrgtxt( GXv_char1, (short)(1024)) ;
         AV17Cadena = GXv_char1[0] ;
         AV14Resultado = GXt_int2 ;
         while ( AV14Resultado == 0 )
         {
            AV9i = (short)(AV9i+1) ;
            AV16Tab_maq[AV9i-1] = AV17Cadena ;
            AV14Resultado = context.getSessionInstances().getDelimitedFiles().dfrnext( ) ;
            GXv_char1[0] = AV17Cadena ;
            GXt_int2 = context.getSessionInstances().getDelimitedFiles().dfrgtxt( GXv_char1, (short)(1024)) ;
            AV17Cadena = GXv_char1[0] ;
            AV14Resultado = GXt_int2 ;
         }
         AV14Resultado = context.getSessionInstances().getDelimitedFiles().dfrclose( ) ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.AV16Tab_maq = creovectormatrizfarchivos.this.AV16Tab_maq;
      this.AV10MaqHdrs = creovectormatrizfarchivos.this.AV10MaqHdrs;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV17Cadena = "" ;
      GXv_char1 = new String[1] ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV9i ;
   private short AV15t ;
   private short AV20MaximaColumna ;
   private short AV14Resultado ;
   private short AV19TotalFilas ;
   private short GXt_int2 ;
   private short Gx_err ;
   private int GX_I ;
   private int GX_J ;
   private String GXv_char1[] ;
   private String AV11Maquinas ;
   private String AV12MaquinasHdrs ;
   private String AV17Cadena ;
   private String[][] AV10MaqHdrs ;
   private String[] AV16Tab_maq ;
}

