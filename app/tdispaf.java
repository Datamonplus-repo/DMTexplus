package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tdispaf", "/app.tdispaf"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tdispaf extends GXWebObjectStub
{
   public tdispaf( )
   {
   }

   public tdispaf( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tdispaf.class ));
   }

   public tdispaf( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tdispaf_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tdispaf_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Parámetros de Fase";
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

