package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.webwdupmaqfas", "/app.webwdupmaqfas"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webwdupmaqfas extends GXWebObjectStub
{
   public webwdupmaqfas( )
   {
   }

   public webwdupmaqfas( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webwdupmaqfas.class ));
   }

   public webwdupmaqfas( int remoteHandle ,
                         ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webwdupmaqfas_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webwdupmaqfas_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Duplicacion Maquinas/Fase";
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

