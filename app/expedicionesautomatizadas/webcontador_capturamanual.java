package app.expedicionesautomatizadas ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.expedicionesautomatizadas.webcontador_capturamanual", "/app.expedicionesautomatizadas.webcontador_capturamanual"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webcontador_capturamanual extends GXWebObjectStub
{
   public webcontador_capturamanual( )
   {
   }

   public webcontador_capturamanual( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webcontador_capturamanual.class ));
   }

   public webcontador_capturamanual( int remoteHandle ,
                                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webcontador_capturamanual_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webcontador_capturamanual_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Captura Manual";
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

