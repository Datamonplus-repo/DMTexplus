package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class creovectorfarchivos extends GXProcedure
{
   public creovectorfarchivos( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( creovectorfarchivos.class ), "" );
   }

   public creovectorfarchivos( int remoteHandle ,
                               ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String[] executeUdp( String aP0 )
   {
      AV18Tab_maq = new String[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV18Tab_maq[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      execute_int(aP0, AV18Tab_maq);
      return AV18Tab_maq;
   }

   public void execute( String aP0 ,
                        String[] AV18Tab_maq )
   {
      execute_int(aP0, AV18Tab_maq);
   }

   private void execute_int( String aP0 ,
                             String[] AV18Tab_maq )
   {
      creovectorfarchivos.this.AV13Maquinas = aP0;
      creovectorfarchivos.this.AV18Tab_maq = AV18Tab_maq;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV10i = (short)(0) ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV18Tab_maq[GX_I-1] = " " ;
         GX_I = (int)(GX_I+1) ;
      }
      AV16Resultado = context.getSessionInstances().getDelimitedFiles().dfropen( AV13Maquinas, 1024, ";", "", httpContext.getMessage( "UTF-8", "")) ;
      if ( (0==AV16Resultado) )
      {
         AV10i = (short)(0) ;
         AV16Resultado = context.getSessionInstances().getDelimitedFiles().dfrnext( ) ;
         GXv_char1[0] = AV8Cadena ;
         GXt_int2 = context.getSessionInstances().getDelimitedFiles().dfrgtxt( GXv_char1, (short)(1024)) ;
         AV8Cadena = GXv_char1[0] ;
         AV16Resultado = GXt_int2 ;
         while ( AV16Resultado == 0 )
         {
            AV10i = (short)(AV10i+1) ;
            AV18Tab_maq[AV10i-1] = AV8Cadena ;
            AV16Resultado = context.getSessionInstances().getDelimitedFiles().dfrnext( ) ;
            GXv_char1[0] = AV8Cadena ;
            GXt_int2 = context.getSessionInstances().getDelimitedFiles().dfrgtxt( GXv_char1, (short)(1024)) ;
            AV8Cadena = GXv_char1[0] ;
            AV16Resultado = GXt_int2 ;
         }
         AV16Resultado = context.getSessionInstances().getDelimitedFiles().dfrclose( ) ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.AV18Tab_maq = creovectorfarchivos.this.AV18Tab_maq;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8Cadena = "" ;
      GXv_char1 = new String[1] ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV10i ;
   private short AV16Resultado ;
   private short GXt_int2 ;
   private short Gx_err ;
   private int GX_I ;
   private String GXv_char1[] ;
   private String AV13Maquinas ;
   private String AV8Cadena ;
   private String[] AV18Tab_maq ;
}

