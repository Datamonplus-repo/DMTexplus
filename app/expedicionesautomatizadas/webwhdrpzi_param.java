package app.expedicionesautomatizadas ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.expedicionesautomatizadas.webwhdrpzi_param", "/app.expedicionesautomatizadas.webwhdrpzi_param"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webwhdrpzi_param extends GXWebObjectStub
{
   public webwhdrpzi_param( )
   {
   }

   public webwhdrpzi_param( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webwhdrpzi_param.class ));
   }

   public webwhdrpzi_param( int remoteHandle ,
                            ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webwhdrpzi_param_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webwhdrpzi_param_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Web WHDRPZI_param";
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

