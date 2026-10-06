package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.webwwkp110datatime", "/app.webwwkp110datatime"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webwwkp110datatime extends GXWebObjectStub
{
   public webwwkp110datatime( )
   {
   }

   public webwwkp110datatime( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webwwkp110datatime.class ));
   }

   public webwwkp110datatime( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webwwkp110datatime_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webwwkp110datatime_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Informe Produccion RESUMEN";
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

