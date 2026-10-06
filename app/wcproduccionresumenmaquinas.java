package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wcproduccionresumenmaquinas", "/app.wcproduccionresumenmaquinas"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wcproduccionresumenmaquinas extends GXWebObjectStub
{
   public wcproduccionresumenmaquinas( )
   {
   }

   public wcproduccionresumenmaquinas( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wcproduccionresumenmaquinas.class ));
   }

   public wcproduccionresumenmaquinas( int remoteHandle ,
                                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wcproduccionresumenmaquinas_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wcproduccionresumenmaquinas_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "WCProduccion Resumen Maquinas";
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

