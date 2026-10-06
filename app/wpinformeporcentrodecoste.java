package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wpinformeporcentrodecoste", "/app.wpinformeporcentrodecoste"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wpinformeporcentrodecoste extends GXWebObjectStub
{
   public wpinformeporcentrodecoste( )
   {
   }

   public wpinformeporcentrodecoste( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wpinformeporcentrodecoste.class ));
   }

   public wpinformeporcentrodecoste( int remoteHandle ,
                                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wpinformeporcentrodecoste_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wpinformeporcentrodecoste_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Informe Por Centro De Costes";
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

