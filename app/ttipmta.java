package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ttipmta", "/app.ttipmta"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttipmta extends GXWebObjectStub
{
   public ttipmta( )
   {
   }

   public ttipmta( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttipmta.class ));
   }

   public ttipmta( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttipmta_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttipmta_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TIPOS MUESTRA";
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

