package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.testcatww", "/app.testcatww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class testcatww extends GXWebObjectStub
{
   public testcatww( )
   {
   }

   public testcatww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( testcatww.class ));
   }

   public testcatww( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new testcatww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new testcatww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Estad.Cliente/Serie/T.Articulo";
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

