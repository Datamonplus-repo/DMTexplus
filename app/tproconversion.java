package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tproconversion", "/app.tproconversion"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tproconversion extends GXWebObjectStub
{
   public tproconversion( )
   {
   }

   public tproconversion( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tproconversion.class ));
   }

   public tproconversion( int remoteHandle ,
                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tproconversion_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tproconversion_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Conversion Procesos Produccion";
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

