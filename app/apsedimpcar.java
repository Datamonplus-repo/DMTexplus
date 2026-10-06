package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apsedimpcar extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apsedimpcar pgm = new apsedimpcar (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {
      String[] aP0 = new String[] {""};
      String[] aP1 = new String[] {""};

      try
      {
         aP0[0] = (String) args[0];
         aP1[0] = (String) args[1];
      }
      catch ( ArrayIndexOutOfBoundsException e )
      {
      }

      execute(aP0, aP1);
   }

   public apsedimpcar( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apsedimpcar.class ), "" );
   }

   public apsedimpcar( int remoteHandle ,
                       ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      apsedimpcar.this.aP1 = new String[] {""};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 )
   {
      apsedimpcar.this.AV9Carpeta = aP0[0];
      this.aP0 = aP0;
      apsedimpcar.this.AV14ValStr = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(psedimpcar.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      this.aP0[0] = apsedimpcar.this.AV9Carpeta;
      this.aP1[0] = apsedimpcar.this.AV14ValStr;
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
   private String AV9Carpeta ;
   private String AV14ValStr ;
   private String[] aP1 ;
   private String[] aP0 ;
}

