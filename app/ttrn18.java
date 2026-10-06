package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ttrn18", "/app.ttrn18"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttrn18 extends GXWebObjectStub
{
   public ttrn18( )
   {
   }

   public ttrn18( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttrn18.class ));
   }

   public ttrn18( int remoteHandle ,
                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttrn18_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttrn18_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Mantenimiento de Dibujos OBSERVACIONES";
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

