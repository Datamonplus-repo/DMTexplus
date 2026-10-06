package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wcwanalisiscostesquimicoss", "/app.wcwanalisiscostesquimicoss"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wcwanalisiscostesquimicoss extends GXWebObjectStub
{
   public wcwanalisiscostesquimicoss( )
   {
   }

   public wcwanalisiscostesquimicoss( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wcwanalisiscostesquimicoss.class ));
   }

   public wcwanalisiscostesquimicoss( int remoteHandle ,
                                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wcwanalisiscostesquimicoss_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wcwanalisiscostesquimicoss_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " HISTORICO RECETAS (HDR)";
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

