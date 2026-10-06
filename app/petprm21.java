package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.petprm21", "/app.petprm21"})
@jakarta.servlet.annotation.MultipartConfig
public final  class petprm21 extends GXWebObjectStub
{
   public petprm21( )
   {
   }

   public petprm21( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( petprm21.class ));
   }

   public petprm21( int remoteHandle ,
                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new petprm21_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new petprm21_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Etiqueta";
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

