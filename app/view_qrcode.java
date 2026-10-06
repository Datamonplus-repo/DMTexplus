package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.view_qrcode", "/app.view_qrcode"})
@jakarta.servlet.annotation.MultipartConfig
public final  class view_qrcode extends GXWebObjectStub
{
   public view_qrcode( )
   {
   }

   public view_qrcode( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( view_qrcode.class ));
   }

   public view_qrcode( int remoteHandle ,
                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   public static void main( String args[] )
   {
      ApplicationContext.getInstance().setCurrentLocation( "" );
      Application.init(app.GXcfg.class);
      app.view_qrcode_impl pgm = new app.view_qrcode_impl (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXStaticWebPanel.copyFiles();
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new view_qrcode_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new view_qrcode_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "view_Qr Code";
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

