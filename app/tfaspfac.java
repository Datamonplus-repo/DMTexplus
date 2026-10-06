package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tfaspfac", "/app.tfaspfac"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tfaspfac extends GXWebObjectStub
{
   public tfaspfac( )
   {
   }

   public tfaspfac( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tfaspfac.class ));
   }

   public tfaspfac( int remoteHandle ,
                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tfaspfac_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tfaspfac_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "PARAMETROS POR ANCHO";
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

