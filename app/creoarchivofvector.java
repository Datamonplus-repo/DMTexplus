package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class creoarchivofvector extends GXProcedure
{
   public creoarchivofvector( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( creoarchivofvector.class ), "" );
   }

   public creoarchivofvector( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] AV16Tab_maq )
   {
      creoarchivofvector.this.aP1 = new String[] {""};
      execute_int(AV16Tab_maq, aP1);
      return aP1[0];
   }

   public void execute( String[] AV16Tab_maq ,
                        String[] aP1 )
   {
      execute_int(AV16Tab_maq, aP1);
   }

   private void execute_int( String[] AV16Tab_maq ,
                             String[] aP1 )
   {
      creoarchivofvector.this.AV16Tab_maq = AV16Tab_maq;
      creoarchivofvector.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV13p = (short)(GXutil.random( )*100) ;
      AV11Maquinas = httpContext.getMessage( "VectorMaquinas", "") + GXutil.trim( GXutil.str( AV13p, 4, 0)) + httpContext.getMessage( ".txt", "") ;
      AV8File.setSource( AV11Maquinas );
      if ( AV8File.exists() )
      {
         AV8File.delete();
      }
      AV14Resultado = context.getSessionInstances().getDelimitedFiles().dfwopen( AV11Maquinas, ";", "", (byte)(0), httpContext.getMessage( "UTF-8", "")) ;
      AV9i = (short)(1) ;
      while ( AV9i <= 100 )
      {
         AV17Cadena = AV16Tab_maq[AV9i-1] ;
         AV14Resultado = context.getSessionInstances().getDelimitedFiles().dfwptxt( AV17Cadena, 0) ;
         AV14Resultado = context.getSessionInstances().getDelimitedFiles().dfwnext( ) ;
         AV9i = (short)(AV9i+1) ;
      }
      AV14Resultado = context.getSessionInstances().getDelimitedFiles().dfwclose( ) ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = creoarchivofvector.this.AV11Maquinas;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV11Maquinas = "" ;
      AV8File = new com.genexus.util.GXFile();
      AV17Cadena = "" ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV13p ;
   private short AV14Resultado ;
   private short AV9i ;
   private short Gx_err ;
   private String AV16Tab_maq[] ;
   private String AV11Maquinas ;
   private String AV17Cadena ;
   private com.genexus.util.GXFile AV8File ;
   private String[] aP1 ;
}

