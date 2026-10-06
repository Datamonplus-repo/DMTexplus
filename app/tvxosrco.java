package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tvxosrco", "/app.tvxosrco"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tvxosrco extends GXWebObjectStub
{
   public tvxosrco( )
   {
   }

   public tvxosrco( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tvxosrco.class ));
   }

   public tvxosrco( int remoteHandle ,
                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tvxosrco_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tvxosrco_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Estructura OSERCO en VERTEX";
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

