package app.core ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class aejemploarreglo extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      aejemploarreglo pgm = new aejemploarreglo (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {
      String[] AV8Maquinas;
      {
         int GX_I;
         AV8Maquinas = new String[3] ;
         GX_I = 1 ;
         while ( GX_I <= 3 )
         {
            AV8Maquinas[GX_I-1] = "" ;
            GX_I = (int)(GX_I+1) ;
         }
      }

      execute(AV8Maquinas);
   }

   public aejemploarreglo( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( aejemploarreglo.class ), "" );
   }

   public aejemploarreglo( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String[] executeUdp( )
   {
      AV8Maquinas = new String[3] ;
      GX_I = 1 ;
      while ( GX_I <= 3 )
      {
         AV8Maquinas[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      execute_int(AV8Maquinas);
      return AV8Maquinas;
   }

   public void execute( String[] AV8Maquinas )
   {
      execute_int(AV8Maquinas);
   }

   private void execute_int( String[] AV8Maquinas )
   {
      aejemploarreglo.this.AV8Maquinas = AV8Maquinas;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8Maquinas[1-1] = httpContext.getMessage( "AAA", "") ;
      AV8Maquinas[2-1] = httpContext.getMessage( "BBB", "") ;
      AV8Maquinas[3-1] = httpContext.getMessage( "CCC", "") ;
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(ejemploarreglo.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      this.AV8Maquinas = aejemploarreglo.this.AV8Maquinas;
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

   private short Gx_err ;
   private int GX_I ;
   private String AV8Maquinas[] ;
}

