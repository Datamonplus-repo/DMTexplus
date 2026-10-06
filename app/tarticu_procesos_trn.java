package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tarticu_procesos_trn", "/app.tarticu_procesos_trn"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tarticu_procesos_trn extends GXWebObjectStub
{
   public tarticu_procesos_trn( )
   {
   }

   public tarticu_procesos_trn( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tarticu_procesos_trn.class ));
   }

   public tarticu_procesos_trn( int remoteHandle ,
                                ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tarticu_procesos_trn_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tarticu_procesos_trn_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Proceso";
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

