package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class anotificationsregistrationhandler extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      anotificationsregistrationhandler pgm = new anotificationsregistrationhandler (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {
      byte aP0 = 0;
      String aP1 = "";
      String aP2 = "";
      String aP3 = "";

      try
      {
         aP0 = (byte) GXutil.lval( args[0]);
         aP1 = (String) args[1];
         aP2 = (String) args[2];
         aP3 = (String) args[3];
      }
      catch ( ArrayIndexOutOfBoundsException e )
      {
      }

      execute(aP0, aP1, aP2, aP3);
   }

   public anotificationsregistrationhandler( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( anotificationsregistrationhandler.class ), "" );
   }

   public anotificationsregistrationhandler( int remoteHandle ,
                                             ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( byte aP0 ,
                        String aP1 ,
                        String aP2 ,
                        String aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( byte aP0 ,
                             String aP1 ,
                             String aP2 ,
                             String aP3 )
   {
      anotificationsregistrationhandler.this.AV11DeviceType = aP0;
      anotificationsregistrationhandler.this.AV8DeviceId = aP1;
      anotificationsregistrationhandler.this.AV10DeviceToken = aP2;
      anotificationsregistrationhandler.this.AV9DeviceName = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      System.out.println( GXutil.trim( AV10DeviceToken) );
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(notificationsregistrationhandler.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
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

   private byte AV11DeviceType ;
   private short Gx_err ;
   private String AV8DeviceId ;
   private String AV10DeviceToken ;
   private String AV9DeviceName ;
}

