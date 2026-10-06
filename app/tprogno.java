package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tprogno", "/app.tprogno"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tprogno extends GXWebObjectStub
{
   public tprogno( )
   {
   }

   public tprogno( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tprogno.class ));
   }

   public tprogno( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tprogno_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tprogno_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TABLAS PROGRAMAS CENTRAL";
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

