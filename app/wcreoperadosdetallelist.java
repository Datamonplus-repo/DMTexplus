package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wcreoperadosdetallelist", "/app.wcreoperadosdetallelist"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wcreoperadosdetallelist extends GXWebObjectStub
{
   public wcreoperadosdetallelist( )
   {
   }

   public wcreoperadosdetallelist( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wcreoperadosdetallelist.class ));
   }

   public wcreoperadosdetallelist( int remoteHandle ,
                                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wcreoperadosdetallelist_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wcreoperadosdetallelist_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "WCReoperados Detalle List";
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

