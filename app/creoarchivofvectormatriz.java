package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class creoarchivofvectormatriz extends GXProcedure
{
   public creoarchivofvectormatriz( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( creoarchivofvectormatriz.class ), "" );
   }

   public creoarchivofvectormatriz( int remoteHandle ,
                                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] AV8Tab_maq ,
                             String[][] AV9MaqHdrs ,
                             String[] aP2 )
   {
      creoarchivofvectormatriz.this.aP3 = new String[] {""};
      execute_int(AV8Tab_maq, AV9MaqHdrs, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] AV8Tab_maq ,
                        String[][] AV9MaqHdrs ,
                        String[] aP2 ,
                        String[] aP3 )
   {
      execute_int(AV8Tab_maq, AV9MaqHdrs, aP2, aP3);
   }

   private void execute_int( String[] AV8Tab_maq ,
                             String[][] AV9MaqHdrs ,
                             String[] aP2 ,
                             String[] aP3 )
   {
      creoarchivofvectormatriz.this.AV8Tab_maq = AV8Tab_maq;
      creoarchivofvectormatriz.this.AV9MaqHdrs = AV9MaqHdrs;
      creoarchivofvectormatriz.this.aP2 = aP2;
      creoarchivofvectormatriz.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV14p = (short)(GXutil.random( )*100) ;
      AV11MaquinasHdrs = httpContext.getMessage( "MatrizMaquinasHdrs", "") + GXutil.trim( GXutil.str( AV14p, 4, 0)) + httpContext.getMessage( ".txt", "") ;
      AV15File.setSource( AV11MaquinasHdrs );
      if ( AV15File.exists() )
      {
         AV15File.delete();
      }
      AV16Resultado = context.getSessionInstances().getDelimitedFiles().dfwopen( AV11MaquinasHdrs, ";", "", (byte)(0), httpContext.getMessage( "UTF-8", "")) ;
      AV12i = (short)(1) ;
      while ( AV12i <= 100 )
      {
         AV13t = (short)(1) ;
         while ( AV13t <= 1000 )
         {
            AV17Cadena = AV9MaqHdrs[AV12i-1][AV13t-1] ;
            AV18Largo = (short)(GXutil.len( AV17Cadena)) ;
            AV16Resultado = context.getSessionInstances().getDelimitedFiles().dfwptxt( AV17Cadena, AV18Largo) ;
            AV13t = (short)(AV13t+1) ;
         }
         AV16Resultado = context.getSessionInstances().getDelimitedFiles().dfwnext( ) ;
         AV12i = (short)(AV12i+1) ;
      }
      AV16Resultado = context.getSessionInstances().getDelimitedFiles().dfwclose( ) ;
      AV14p = (short)(GXutil.random( )*100) ;
      AV10Maquinas = httpContext.getMessage( "VectorMaquinas", "") + GXutil.trim( GXutil.str( AV14p, 4, 0)) + httpContext.getMessage( ".txt", "") ;
      AV15File.setSource( AV10Maquinas );
      if ( AV15File.exists() )
      {
         AV15File.delete();
      }
      AV16Resultado = context.getSessionInstances().getDelimitedFiles().dfwopen( AV10Maquinas, ";", "", (byte)(0), httpContext.getMessage( "UTF-8", "")) ;
      AV12i = (short)(1) ;
      while ( AV12i <= 100 )
      {
         AV17Cadena = AV8Tab_maq[AV12i-1] ;
         AV16Resultado = context.getSessionInstances().getDelimitedFiles().dfwptxt( AV17Cadena, 0) ;
         AV16Resultado = context.getSessionInstances().getDelimitedFiles().dfwnext( ) ;
         AV12i = (short)(AV12i+1) ;
      }
      AV16Resultado = context.getSessionInstances().getDelimitedFiles().dfwclose( ) ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = creoarchivofvectormatriz.this.AV10Maquinas;
      this.aP3[0] = creoarchivofvectormatriz.this.AV11MaquinasHdrs;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV10Maquinas = "" ;
      AV11MaquinasHdrs = "" ;
      AV15File = new com.genexus.util.GXFile();
      AV17Cadena = "" ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV14p ;
   private short AV16Resultado ;
   private short AV12i ;
   private short AV13t ;
   private short AV18Largo ;
   private short Gx_err ;
   private String AV8Tab_maq[] ;
   private String AV9MaqHdrs[][] ;
   private String AV10Maquinas ;
   private String AV11MaquinasHdrs ;
   private String AV17Cadena ;
   private com.genexus.util.GXFile AV15File ;
   private String[] aP3 ;
   private String[] aP2 ;
}

