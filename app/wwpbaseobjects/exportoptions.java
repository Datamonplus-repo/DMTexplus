package app.wwpbaseobjects ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wwpbaseobjects.exportoptions", "/app.wwpbaseobjects.exportoptions"})
@jakarta.servlet.annotation.MultipartConfig
public final  class exportoptions extends GXWebObjectStub
{
   public exportoptions( )
   {
   }

   public exportoptions( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( exportoptions.class ));
   }

   public exportoptions( int remoteHandle ,
                         ModelContext context )
   {
      super(remoteHandle, context);
   }

   public static void main( String args[] )
   {
      ApplicationContext.getInstance().setCurrentLocation( "" );
      Application.init(app.GXcfg.class);
      app.wwpbaseobjects.exportoptions_impl pgm = new app.wwpbaseobjects.exportoptions_impl (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXStaticWebPanel.copyFiles();
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new exportoptions_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new exportoptions_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "WWP_ExportOptionsDescription";
   }

   protected boolean IntegratedSecurityEnabled( )
   {
      return false;
   }

   protected int IntegratedSecurityLevel( )
   {
      return 0;
   }

   protected String IntegratedSecurityPermissionPrefix( )
   {
      return "";
   }

   protected String EncryptURLParameters( )
   {
      return "NO";
   }

}

