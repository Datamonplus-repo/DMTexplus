package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tpsolsal", "/app.tpsolsal"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tpsolsal extends GXWebObjectStub
{
   public tpsolsal( )
   {
   }

   public tpsolsal( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tpsolsal.class ));
   }

   public tpsolsal( int remoteHandle ,
                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tpsolsal_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tpsolsal_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "SOLIDEZ A SALIVA";
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

