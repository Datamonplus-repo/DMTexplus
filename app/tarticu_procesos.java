package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tarticu_procesos", "/app.tarticu_procesos"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tarticu_procesos extends GXWebObjectStub
{
   public tarticu_procesos( )
   {
   }

   public tarticu_procesos( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tarticu_procesos.class ));
   }

   public tarticu_procesos( int remoteHandle ,
                            ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tarticu_procesos_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tarticu_procesos_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Proceso";
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

