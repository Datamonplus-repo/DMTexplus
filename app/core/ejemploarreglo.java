package app.core ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ejemploarreglo extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      ejemploarreglo pgm = new ejemploarreglo (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {
      String[] AV2Maquinas;
      {
         int GX_I;
         AV2Maquinas = new String[3] ;
         GX_I = 1 ;
         while ( GX_I <= 3 )
         {
            AV2Maquinas[GX_I-1] = "" ;
            GX_I = (int)(GX_I+1) ;
         }
      }

      execute(AV2Maquinas);
   }

   public ejemploarreglo( )
   {
      super( -1 , new ModelContext( ejemploarreglo.class ), "" );
      Application.init(app.GXcfg.class);
   }

   public ejemploarreglo( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ejemploarreglo.class ), "" );
   }

   public ejemploarreglo( int remoteHandle ,
                          ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String[] executeUdp( )
   {
      AV2Maquinas = new String[3] ;
      GX_I = 1 ;
      while ( GX_I <= 3 )
      {
         AV2Maquinas[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      execute_int(AV2Maquinas);
      return AV2Maquinas;
   }

   public void execute( String[] AV2Maquinas )
   {
      execute_int(AV2Maquinas);
   }

   private void execute_int( String[] AV2Maquinas )
   {
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      new app.core.aejemploarreglo(remoteHandle, context).execute( AV2Maquinas );
      cleanup();
   }

   protected void cleanup( )
   {
      CloseOpenCursors();
      Application.cleanup(context, this, remoteHandle);
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
   private String AV2Maquinas[] ;
}

