package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wcmtskgsexpautsindetalle", "/app.wcmtskgsexpautsindetalle"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wcmtskgsexpautsindetalle extends GXWebObjectStub
{
   public wcmtskgsexpautsindetalle( )
   {
   }

   public wcmtskgsexpautsindetalle( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wcmtskgsexpautsindetalle.class ));
   }

   public wcmtskgsexpautsindetalle( int remoteHandle ,
                                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wcmtskgsexpautsindetalle_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wcmtskgsexpautsindetalle_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Mts, Kgs Expediciones Automatizadas";
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

