package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.webwdetpie", "/app.webwdetpie"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webwdetpie extends GXWebObjectStub
{
   public webwdetpie( )
   {
   }

   public webwdetpie( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webwdetpie.class ));
   }

   public webwdetpie( int remoteHandle ,
                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webwdetpie_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webwdetpie_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Seleccion PIEZAS";
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

