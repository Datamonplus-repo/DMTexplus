package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tprocedgeneral", "/app.tprocedgeneral"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tprocedgeneral extends GXWebObjectStub
{
   public tprocedgeneral( )
   {
   }

   public tprocedgeneral( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tprocedgeneral.class ));
   }

   public tprocedgeneral( int remoteHandle ,
                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tprocedgeneral_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tprocedgeneral_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TPROCEDGeneral";
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

