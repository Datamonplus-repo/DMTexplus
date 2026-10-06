package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pget_downloadfile extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      pget_downloadfile pgm = new pget_downloadfile (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {
      String aP0 = "";
      String aP1 = "";
      String aP2 = "";

      try
      {
         aP0 = (String) args[0];
         aP1 = (String) args[1];
         aP2 = (String) args[2];
      }
      catch ( ArrayIndexOutOfBoundsException e )
      {
      }

      execute(aP0, aP1, aP2);
   }

   public pget_downloadfile( )
   {
      super( -1 , new ModelContext( pget_downloadfile.class ), "" );
      Application.init(app.GXcfg.class);
   }

   public pget_downloadfile( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pget_downloadfile.class ), "" );
   }

   public pget_downloadfile( int remoteHandle ,
                             ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String aP2 )
   {
      pget_downloadfile.this.AV2vrPathCompleto = aP0;
      pget_downloadfile.this.AV3vrNomeArquivo = aP1;
      pget_downloadfile.this.AV4ContentType = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
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
   private String AV2vrPathCompleto ;
   private String AV3vrNomeArquivo ;
   private String AV4ContentType ;
}

