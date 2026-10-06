package app.expedicionesautomatizadas ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.expedicionesautomatizadas.webcontador_dispos_observacio", "/app.expedicionesautomatizadas.webcontador_dispos_observacio"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webcontador_dispos_observacio extends GXWebObjectStub
{
   public webcontador_dispos_observacio( )
   {
   }

   public webcontador_dispos_observacio( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webcontador_dispos_observacio.class ));
   }

   public webcontador_dispos_observacio( int remoteHandle ,
                                         ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webcontador_dispos_observacio_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webcontador_dispos_observacio_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Web Contador_Dis Pos_Observacio";
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

