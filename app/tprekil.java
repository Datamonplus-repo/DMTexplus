package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tprekil", "/app.tprekil"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tprekil extends GXWebObjectStub
{
   public tprekil( )
   {
   }

   public tprekil( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tprekil.class ));
   }

   public tprekil( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tprekil_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tprekil_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "PRECIOS POR KILOS";
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

