package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ttrn19", "/app.ttrn19"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttrn19 extends GXWebObjectStub
{
   public ttrn19( )
   {
   }

   public ttrn19( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttrn19.class ));
   }

   public ttrn19( int remoteHandle ,
                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttrn19_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttrn19_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Mantenimiento de Dibujos MEZCLAS";
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

