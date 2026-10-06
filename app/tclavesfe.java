package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tclavesfe", "/app.tclavesfe"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tclavesfe extends GXWebObjectStub
{
   public tclavesfe( )
   {
   }

   public tclavesfe( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tclavesfe.class ));
   }

   public tclavesfe( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tclavesfe_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tclavesfe_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Claves Formulas Estampacion";
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

