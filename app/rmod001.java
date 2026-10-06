package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.rmod001", "/app.rmod001"})
@jakarta.servlet.annotation.MultipartConfig
public final  class rmod001 extends GXWebObjectStub
{
   public rmod001( )
   {
   }

   public rmod001( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( rmod001.class ));
   }

   public rmod001( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new rmod001_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new rmod001_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "ORDEM DE COMPRA";
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

