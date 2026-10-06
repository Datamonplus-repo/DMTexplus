package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tpmq011", "/app.tpmq011"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tpmq011 extends GXWebObjectStub
{
   public tpmq011( )
   {
   }

   public tpmq011( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tpmq011.class ));
   }

   public tpmq011( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tpmq011_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tpmq011_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "PLANEAR MAQUINAS";
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

