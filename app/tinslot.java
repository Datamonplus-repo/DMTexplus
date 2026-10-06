package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tinslot", "/app.tinslot"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tinslot extends GXWebObjectStub
{
   public tinslot( )
   {
   }

   public tinslot( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tinslot.class ));
   }

   public tinslot( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tinslot_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tinslot_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Ins LOTE";
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

