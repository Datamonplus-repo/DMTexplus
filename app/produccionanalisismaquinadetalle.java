package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.produccionanalisismaquinadetalle", "/app.produccionanalisismaquinadetalle"})
@jakarta.servlet.annotation.MultipartConfig
public final  class produccionanalisismaquinadetalle extends GXWebObjectStub
{
   public produccionanalisismaquinadetalle( )
   {
   }

   public produccionanalisismaquinadetalle( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( produccionanalisismaquinadetalle.class ));
   }

   public produccionanalisismaquinadetalle( int remoteHandle ,
                                            ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new produccionanalisismaquinadetalle_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new produccionanalisismaquinadetalle_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Produccion Analisis Maquina Detalle";
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

