package app.ingenieria ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ingenieria.amrec_evaluarauto", "/app.ingenieria.amrec_evaluarauto"})
@jakarta.servlet.annotation.MultipartConfig
public final  class amrec_evaluarauto extends GXWebObjectStub
{
   public amrec_evaluarauto( )
   {
   }

   public amrec_evaluarauto( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( amrec_evaluarauto.class ));
   }

   public amrec_evaluarauto( int remoteHandle ,
                             ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new amrec_evaluarauto_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new amrec_evaluarauto_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Aplicación para configurar como Demonio en Server para evaluar datos que se reciben de las máquinas";
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

