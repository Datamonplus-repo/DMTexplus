package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tbarpet", "/app.tbarpet"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tbarpet extends GXWebObjectStub
{
   public tbarpet( )
   {
   }

   public tbarpet( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tbarpet.class ));
   }

   public tbarpet( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tbarpet_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tbarpet_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "BARCADAS PETITAS";
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

