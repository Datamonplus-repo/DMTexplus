package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.rdocpre", "/app.rdocpre"})
@jakarta.servlet.annotation.MultipartConfig
public final  class rdocpre extends GXWebObjectStub
{
   public rdocpre( )
   {
   }

   public rdocpre( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( rdocpre.class ));
   }

   public rdocpre( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new rdocpre_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new rdocpre_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "INFORME CLIENTES,PRECIOS";
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

