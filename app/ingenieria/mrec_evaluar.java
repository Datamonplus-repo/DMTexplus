package app.ingenieria ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ingenieria.mrec_evaluar", "/app.ingenieria.mrec_evaluar"})
@jakarta.servlet.annotation.MultipartConfig
public final  class mrec_evaluar extends GXWebObjectStub
{
   public mrec_evaluar( )
   {
   }

   public mrec_evaluar( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( mrec_evaluar.class ));
   }

   public mrec_evaluar( int remoteHandle ,
                        ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new mrec_evaluar_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new mrec_evaluar_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Activar la evaluación de los datos enviados por las máuinas";
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

